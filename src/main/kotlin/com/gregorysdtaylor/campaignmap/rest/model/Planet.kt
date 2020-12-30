package com.gregorysdtaylor.campaignmap.rest.model

import java.net.URL
import javax.persistence.*
import javax.persistence.CascadeType.ALL

@Entity
data class Planet(
        @Id @GeneratedValue var id: Long,
        @ManyToOne @JoinColumn(name="campaign_id") var campaign: Campaign,
        var name: String?,
        @Column(columnDefinition="TEXT") var description: String?,
        var diameterInKm: Double?,
        @OneToMany(cascade=[ALL], mappedBy = "planet") var locations: MutableList<Location> = mutableListOf(),
        var imageUrl: URL?,
        var mapUrl: URL?
)