package com.growingtree.growingtreeserver.exception.messages

enum class ErrorMessage(
    val status: Int,
    val message: String,
) {
    // AUTH
    FAILED_SENDING_MAIL(404, "인증메일 전송을 실패했습니다."),
    FAILED_SIGN_UP(404, "회원가입을 실패했습니다."),
    INVALID_EMAIL(404, "이메일 형식이 맞지 않습니다."),
    INVALID_PASSWORD(404, "비밀번호 형식이 맞지 않습니다."),
    FAILED_SIGN_IN(404, "회원정보가 일치하지 않습니다."),

    // STAMP
    FAILED_GET_STAMP_INFO(404, "도장판 정보 불러오기를 실패했습니다."),
    FAILED_ADD_STAMP(404, "도장 추가를 실패했습니다"),
    FAILED_UPDATE_GOAL(404, "목표 수정을 실패했습니다."),
    FAILED_DELETE_GOAL(404, "목표 삭제를 실패했습니다."),

    GOAL_NOT_FOUND(404, "목표를 찾을 수 없습니다."),

    // USER
    USER_NOT_FOUND(404, "사용자를 찾을 수 없습니다."),
    USER_EXIST(404, "이미 존재하는 이메일입니다."),

    // SERVER
    SERVER_CONNECT_FAIL(501, "서버 연결에 실패했습니다."),
}
