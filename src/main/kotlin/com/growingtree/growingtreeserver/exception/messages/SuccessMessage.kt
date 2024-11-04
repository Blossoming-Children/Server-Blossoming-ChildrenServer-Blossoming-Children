package com.growingtree.growingtreeserver.exception.messages

enum class SuccessMessage(
    val status: Int,
    val message: String,
) {
    // AUTH
    SUCCESS_SEND_MAIL(200, "메일 전송에 성공했습니다."),
    SUCCESS_SIGN_UP(201, "회원가입에 성공했습니다."),

    // STAMP
    SUCCESS_GET_STAMP_INFO(200, "도장판 정보 불러오기를 성공했습니다."),
    SUCCESS_ADD_STAMP(201, "도장 추가를 성공했습니다."),
    SUCCESS_UPDATE_GOAL(201, "목표 수정을 성공했습니다."),
    SUCCESS_DELETE_GOAL(200, "목표 삭제를 성공했습니다."),
}
