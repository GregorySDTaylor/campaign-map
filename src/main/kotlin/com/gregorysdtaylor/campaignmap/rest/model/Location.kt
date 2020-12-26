package com.gregorysdtaylor.campaignmap.rest.model

import java.net.URL
import javax.persistence.*

@Entity
data class Location(
        @Id @GeneratedValue val id: Long,
        @ManyToOne @JoinColumn(name="planet_id") val planet: Planet,
        val name: String?,
        val description: String?,
        val latitude: Double?,
        val longitude: Double?,
        val imageUrl: URL?,
        @ManyToOne @JoinColumn(name="controlling_faction_id") val controllingFaction: Faction,
)
