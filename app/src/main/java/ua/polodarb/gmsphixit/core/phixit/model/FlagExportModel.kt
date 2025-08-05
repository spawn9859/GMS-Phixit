package ua.polodarb.gmsphixit.core.phixit.model

import kotlinx.serialization.Serializable

@Serializable
data class FlagExportModel(
    val packageName: String,
    val exportTimestamp: Long,
    val flags: List<BaseFlagModel>
)