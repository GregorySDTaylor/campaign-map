package com.gregorysdtaylor.campaignmap.rest.model

import java.net.URL
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
data class Location(
        @Id val id: Long,
        @ManyToOne @JoinColumn(name="planet_id") val planet: Planet,
        val name: String?,
        val description: String?,
        val latitude: Double?,
        val longitude: Double?,
        val imageUrl: URL?
)
