package com.growingtree.growingtreeserver.controller

import com.growingtree.growingtreeserver.exception.messages.SuccessMessage
import com.growingtree.growingtreeserver.exception.responses.BaseResponse
import com.growingtree.growingtreeserver.service.StampService
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/stamp")
@RequiredArgsConstructor
class StampController(
    val stampService: StampService,
) {
    @GetMapping("")
    fun getStampInfo(
        @RequestHeader("Authorization") userId: Long,
    ): BaseResponse<*> {
        val response = stampService.getGoals(userId)
        return BaseResponse.of(SuccessMessage.SUCCESS_GET_STAMP_INFO, response)
    }
}