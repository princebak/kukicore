package com.kindev.kukicore.controller;

import com.kindev.kukicore.domain.Feature;
import com.kindev.kukicore.domain.dto.FeatureDto;
import com.kindev.kukicore.domain.mapstruct.MapStructMapper;
import com.kindev.kukicore.service.FeatureService;
import com.kindev.kukicore.service.util.ResponseModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/features")
public class FeatureController {

    private FeatureService featureService;
    private MapStructMapper mapStructMapper;

    @GetMapping("/health")
    public String health() {
        return "ok";
    }

    @GetMapping("")
    public ResponseModel<FeatureDto> getAllFeatures() {
        log.info("Call to Inside getAllFeatures FeatureController........");
        ResponseModel<Feature> features = featureService.getAllFeatures();
        ResponseModel<FeatureDto> featureDtos = new ResponseModel<>();
        featureDtos.setContent(
                features.getContent().parallelStream()
                        .map(feature -> mapStructMapper.mapFeatureToFeatureDto(feature))
                        .collect(Collectors.toList())
        );
        return featureDtos;
    }

    @GetMapping("/feature")
    public FeatureDto getFeature(@RequestHeader("id") Long id) {
        log.info("Call to Inside getFeatureById Inside FeatureController........");
        Feature feature = featureService.getFeatureById(id);
        FeatureDto featureDto = mapStructMapper.mapFeatureToFeatureDto(feature);
        return featureDto;
    }
    @PostMapping("")
    public FeatureDto createFeature(@RequestBody FeatureDto featureDto) {
        log.info("Call to Inside createFeature Inside FeatureController........");
        return mapStructMapper.mapFeatureToFeatureDto(
                featureService.saveFeature(mapStructMapper.mapFeatureDtoToFeature(featureDto))
        );
    }
    @PostMapping("/update")
    public FeatureDto updateFeature(@RequestBody FeatureDto featureDto) {
        log.info("Call to Inside createFeature Inside FeatureController........");
        return mapStructMapper.mapFeatureToFeatureDto(
                featureService.updateFeature(mapStructMapper.mapFeatureDtoToFeature(featureDto))
        );
    }
    @PostMapping("/delete")
    public boolean updateFeature(@RequestHeader("id") Long id) {
        log.info("Call to Inside createFeature Inside FeatureController........");
        return featureService.deleteFeature(id);
    }
}
