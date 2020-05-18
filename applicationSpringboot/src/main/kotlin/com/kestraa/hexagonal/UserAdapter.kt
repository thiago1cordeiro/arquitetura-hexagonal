package com.kestraa.hexagonal

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder(
    "data"
)
data class UserAdapter(val id: Long, val name: String)