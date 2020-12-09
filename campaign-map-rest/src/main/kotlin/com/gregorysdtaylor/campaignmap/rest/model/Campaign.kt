package com.gregorysdtaylor.campaignmap.rest.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class Campaign(
        @Id val id: Long,
        val name: String = "",
        val description: String = "",
        @OneToMany(mappedBy = "campaign") val planets: MutableList<Planet> = mutableListOf()
)
