package com.gregorysdtaylor.campaignmap.rest.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
data class Planet(
        @Id val id: Long,
        @ManyToOne @JoinColumn(name="campaign_id") val campaign: Campaign,
        val name: String,
        val description: String,
        val diameterInKm: Double
)