package com.kindev.kukicore.controller;

import com.kindev.kukicore.domain.Lodgement;
import com.kindev.kukicore.domain.Lodgement;
import com.kindev.kukicore.domain.dto.LodgementDto;
import com.kindev.kukicore.domain.dto.LodgementForReservationDto;
import com.kindev.kukicore.domain.mapstruct.MapStructMapper;
import com.kindev.kukicore.service.LodgementService;
import com.kindev.kukicore.service.LodgementService;
import com.kindev.kukicore.service.util.ResponseModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/lodgements")
public class LodgementController {

    private LodgementService lodgementService;
    private MapStructMapper mapStructMapper;

    @GetMapping("/health")
    public String health() {
        return "ok";
    }

    @GetMapping("")
    public ResponseModel<LodgementDto> getAllLodgements() {
        log.info("Call to Inside getAllLodgements LodgementController........");
        ResponseModel<Lodgement> lodgements = lodgementService.getAllLodgements();
        ResponseModel<LodgementDto> lodgementDtos = new ResponseModel<>();
        lodgementDtos.setContent(
                lodgements.getContent().parallelStream()
                        .map(lodgement -> mapStructMapper.mapLodgementToLodgementDto(lodgement))
                        .collect(Collectors.toList())
        );
        return lodgementDtos;
    }

    @GetMapping("/lodgement")
    public LodgementDto getLodgement(@RequestHeader("id") Long id) {
        log.info("Call to Inside getLodgementById Inside LodgementController........");
        Lodgement lodgement = lodgementService.getLodgementById(id);
        LodgementDto lodgementDto = mapStructMapper.mapLodgementToLodgementDto(lodgement);
        return lodgementDto;
    }
    @PostMapping("")
    public LodgementDto createLodgement(@RequestBody LodgementForReservationDto lodgementForReservationDto) {
        log.info("Call to Inside createLodgement Inside LodgementController........");
        return mapStructMapper.mapLodgementToLodgementDto(
                lodgementService.saveLodgement(mapStructMapper.mapLodgementForReservationDtoToLodgement(lodgementForReservationDto))
        );
    }
    @PostMapping("/update")
    public LodgementDto updateLodgement(@RequestBody LodgementDto lodgementDto) {
        log.info("Call to Inside createLodgement Inside LodgementController........");
        return mapStructMapper.mapLodgementToLodgementDto(
                lodgementService.saveLodgement(mapStructMapper.mapLodgementDtoToLodgement(lodgementDto))
        );
    }
    @PostMapping("/delete")
    public boolean deleteLodgement(@RequestHeader("id") Long id) {
        log.info("Call to Inside createLodgement Inside LodgementController........");
        return lodgementService.deleteLodgement(id);
    }
}

