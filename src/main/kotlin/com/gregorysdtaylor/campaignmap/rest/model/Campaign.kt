package com.gregorysdtaylor.campaignmap.rest.model

import java.net.URL
import javax.persistence.*
import javax.persistence.CascadeType.ALL

@Entity
data class Campaign(
        @Id @GeneratedValue val id: Long,
        val name: String?,
        val description: String?,
        @OneToMany(cascade=[ALL], mappedBy = "campaign") val planets: MutableList<Planet> = mutableListOf(),
        val imageUrl: URL?,
        val mapUrl: URL?
)
