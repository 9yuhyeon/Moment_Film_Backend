package com.team_7.moment_film.domain.customfilter.controller;

import com.team_7.moment_film.domain.customfilter.dto.FilterRequestDto;
import com.team_7.moment_film.domain.customfilter.dto.FilterResponseDto;
import com.team_7.moment_film.domain.customfilter.service.FilterService;
import com.team_7.moment_film.global.dto.CustomResponseEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/filter")
@RequiredArgsConstructor
public class FilterController {

    private final FilterService filterService;

    //커스텀한 필터 등록
    @PostMapping("")
    public CustomResponseEntity<FilterResponseDto> createFilter(@RequestBody FilterRequestDto requestDto){
        return filterService.createFilter(requestDto);
    }

    //촬영 후 유저들이 커스텀한 필터 모두 조회
    @GetMapping
    public List<FilterResponseDto> getAllFilter(){
        return filterService.getAllFilter();
    }

    //필터 적용(선택)
    @PostMapping("/{filterId}")
    public CustomResponseEntity<FilterResponseDto> selectFilter(@PathVariable Long filterId) {
        return filterService.selectFilter(filterId);
    }

}
