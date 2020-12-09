package com.gregorysdtaylor.campaignmap.rest.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Campaign(@Id val id: Long, val name: String)
