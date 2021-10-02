package com.kindev.kukicore.controller;

import com.kindev.kukicore.domain.LodgementType;
import com.kindev.kukicore.domain.dto.LodgementTypeDto;
import com.kindev.kukicore.domain.dto.LodgementTypeSlimDto;
import com.kindev.kukicore.domain.mapstruct.MapStructMapper;
import com.kindev.kukicore.service.LodgementTypeService;
import com.kindev.kukicore.service.util.ResponseModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/lodgementTypes")
public class LodgementTypeController {


    private LodgementTypeService lodgementTypeService;
    private MapStructMapper mapStructMapper;

    @GetMapping("/health")
    public String health() {
        return "ok";
    }

    @GetMapping("")
    public ResponseModel<LodgementTypeDto> getAllLodgementTypes() {
        log.info("Call to Inside getAllLodgementTypes LodgementTypeController........");
        ResponseModel<LodgementType> lodgementTypes = lodgementTypeService.getAllLodgementTypes();
        ResponseModel<LodgementTypeDto> lodgementTypeDtos = new ResponseModel<>();
        lodgementTypeDtos.setContent(
                lodgementTypes.getContent().parallelStream()
                        .map(lodgementType -> mapStructMapper.mapLodgementTypeToLodgementTypeDto(lodgementType))
                        .collect(Collectors.toList())
        );
        return lodgementTypeDtos;
    }

    @GetMapping("/lodgementType")
    public LodgementTypeSlimDto getLodgementType(@RequestHeader("id") Long id) {
        log.info("Call to Inside getLodgementTypeById Inside LodgementTypeController........");
        LodgementType lodgementType = lodgementTypeService.getLodgementTypeById(id);
        LodgementTypeSlimDto lodgementTypeSlimDto = mapStructMapper.mapLodgementTypeToLodgementTypeSlimDto(lodgementType);
        return lodgementTypeSlimDto;
    }
    @PostMapping("")
    public LodgementTypeSlimDto createLodgementType(@RequestBody LodgementTypeSlimDto lodgementTypeSlimDto) {
        log.info("Call to Inside createLodgementType Inside LodgementTypeController........");
        return mapStructMapper.mapLodgementTypeToLodgementTypeSlimDto(
                lodgementTypeService.saveLodgementType(mapStructMapper.mapLodgementTypeSlimDtoToLodgementType(lodgementTypeSlimDto))
        );
    }
    @PostMapping("/update")
    public LodgementTypeSlimDto updateLodgementType(@RequestBody LodgementTypeSlimDto lodgementTypeSlimDto) {
        log.info("Call to Inside createLodgementType Inside LodgementTypeController........");
        return mapStructMapper.mapLodgementTypeToLodgementTypeSlimDto(
                lodgementTypeService.updateLodgementType(mapStructMapper.mapLodgementTypeSlimDtoToLodgementType(lodgementTypeSlimDto))
        );
    }
    @PostMapping("/delete")
    public boolean updateLodgementType(@RequestHeader("id") Long id) {
        log.info("Call to Inside createLodgementType Inside LodgementTypeController........");
        return lodgementTypeService.deleteLodgementType(id);
    }
}
