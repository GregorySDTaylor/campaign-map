package com.gregorysdtaylor.campaignmap.rest.model

import java.net.URL
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class Faction(
        @Id @GeneratedValue var id: Long,
        var name: String?,
        var description: String?,
        var imageUrl: URL?,
        var insigniaUrl: URL?,
        @OneToMany(mappedBy = "controllingFaction") var controlledLocations: MutableList<Location> = mutableListOf()
)
