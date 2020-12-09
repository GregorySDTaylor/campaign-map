package com.gregorysdtaylor.campaignmap.rest.model

import org.springframework.data.repository.CrudRepository

interface PlanetRepository : CrudRepository<Planet, Long> {
}