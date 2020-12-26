package com.gregorysdtaylor.campaignmap.rest.model

import java.net.URL
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class Campaign(
        @Id @GeneratedValue val id: Long,
        val name: String?,
        val description: String?,
        @OneToMany(mappedBy = "campaign") val planets: MutableList<Planet> = mutableListOf(),
        val imageUrl: URL?,
        val mapUrl: URL?
)
