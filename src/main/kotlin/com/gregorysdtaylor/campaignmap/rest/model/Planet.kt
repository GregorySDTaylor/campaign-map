package com.gregorysdtaylor.campaignmap.rest.model

import java.net.URL
import javax.persistence.*
import javax.persistence.CascadeType.ALL

@Entity
data class Planet(
        @Id @GeneratedValue val id: Long,
        @ManyToOne @JoinColumn(name="campaign_id") val campaign: Campaign,
        val name: String?,
        val description: String?,
        val diameterInKm: Double?,
        @OneToMany(cascade=[ALL], mappedBy = "planet") val locations: MutableList<Location> = mutableListOf(),
        val imageUrl: URL?,
        val mapUrl: URL?
)