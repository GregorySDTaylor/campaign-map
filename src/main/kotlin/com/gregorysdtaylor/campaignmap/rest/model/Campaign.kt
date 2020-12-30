package com.gregorysdtaylor.campaignmap.rest.model

import java.net.URL
import javax.persistence.*
import javax.persistence.CascadeType.ALL

@Entity
data class Campaign(
        @Id @GeneratedValue var id: Long,
        var name: String?,
        var description: String?,
        @OneToMany(cascade=[ALL], mappedBy = "campaign") var planets: MutableList<Planet> = mutableListOf(),
        var imageUrl: URL?,
        var mapUrl: URL?
)
