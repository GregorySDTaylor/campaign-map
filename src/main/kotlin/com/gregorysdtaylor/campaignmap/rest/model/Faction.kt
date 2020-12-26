package com.gregorysdtaylor.campaignmap.rest.model

import java.net.URL
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class Faction(
        @Id @GeneratedValue val id: Long,
        val name: String?,
        val description: String?,
        val imageUrl: URL?,
        val insigniaUrl: URL?,
        @OneToMany(mappedBy = "controllingFaction") val controlledLocations: MutableList<Location> = mutableListOf()
)
