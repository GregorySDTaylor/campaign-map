package com.gregorysdtaylor.campaignmap.rest.model

import java.net.URL
import javax.persistence.*

@Entity
data class Faction(
        @Id @GeneratedValue var id: Long,
        var name: String?,
        @Lob var description: String?,
        var imageUrl: URL?,
        var insigniaUrl: URL?,
        @OneToMany(mappedBy = "controllingFaction") var controlledLocations: MutableList<Location> = mutableListOf(),
        @ManyToOne @JoinColumn(name="campaign_id") var campaign: Campaign
)
