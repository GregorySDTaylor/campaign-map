package com.gregorysdtaylor.campaignmap.rest.model

import java.net.URL
import javax.persistence.*

@Entity
data class Location(
        @Id @GeneratedValue var id: Long,
        @ManyToOne @JoinColumn(name="planet_id") var planet: Planet,
        var name: String?,
        @Column(columnDefinition="TEXT") var description: String?,
        var latitude: Double?,
        var longitude: Double?,
        var imageUrl: URL?,
        @ManyToOne @JoinColumn(name="controlling_faction_id") var controllingFaction: Faction?,
)
