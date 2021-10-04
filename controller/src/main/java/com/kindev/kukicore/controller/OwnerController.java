package com.kindev.kukicore.controller;

import com.kindev.kukicore.domain.Owner;
import com.kindev.kukicore.domain.dto.OwnerDto;
import com.kindev.kukicore.domain.dto.OwnerSlimDto;
import com.kindev.kukicore.domain.mapstruct.MapStructMapper;
import com.kindev.kukicore.service.OwnerService;
import com.kindev.kukicore.service.util.ResponseModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/owners")
public class OwnerController {

    private OwnerService ownerService;
    private MapStructMapper mapStructMapper;

    @GetMapping("/health")
    public String health() {
        return "ok";
    }

    @GetMapping("")
    public ResponseModel<OwnerDto> getAllOwners() {
        log.info("Call to Inside getAllOwners OwnerController........");
        ResponseModel<Owner> owners = ownerService.getAllOwners();
        ResponseModel<OwnerDto> ownerDtos = new ResponseModel<>();
        ownerDtos.setContent(
                owners.getContent().parallelStream()
                        .map(owner -> mapStructMapper.mapOwnerToOwnerDto(owner))
                        .collect(Collectors.toList())
        );
        return ownerDtos;
    }

    @GetMapping("/owner")
    public OwnerDto getOwner(@RequestHeader("id") Long id) {
        log.info("Call to Inside getOwnerById Inside OwnerController........");
        Owner owner = ownerService.getOwnerById(id);
        OwnerDto ownerDto = mapStructMapper.mapOwnerToOwnerDto(owner);
        return ownerDto;
    }
    @PostMapping("")
    public OwnerDto createOwner(@RequestBody OwnerSlimDto ownerSlimDto) {
        log.info("Call to Inside createOwner Inside OwnerController........");
        return mapStructMapper.mapOwnerToOwnerDto(
                ownerService.saveOwner(mapStructMapper.mapOwnerSlimDtoToOwner(ownerSlimDto))
        );
    }
    @PostMapping("/update")
    public OwnerDto updateOwner(@RequestBody OwnerDto ownerDto) {
        log.info("Call to Inside createOwner Inside OwnerController........");
        return mapStructMapper.mapOwnerToOwnerDto(
                ownerService.saveOwner(mapStructMapper.mapOwnerDtoToOwner(ownerDto))
        );
    }
    @PostMapping("/delete")
    public boolean deleteOwner(@RequestHeader("id") Long id) {
        log.info("Call to Inside createOwner Inside OwnerController........");
        return ownerService.deleteOwner(id);
    }
}
