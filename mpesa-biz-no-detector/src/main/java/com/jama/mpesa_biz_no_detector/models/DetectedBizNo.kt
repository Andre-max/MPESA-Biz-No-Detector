package com.jama.mpesa_biz_no_detector.models

import com.jama.mpesa_biz_no_detector.enums.BizNoType

data class DetectedBizNo(
    val type: BizNoType,
    val businessNo: Int,
    val accountNo: String?
)