package com.gregorysdtaylor.campaignmap.rest.model

import org.springframework.data.repository.CrudRepository

interface CampaignRepository : CrudRepository<Campaign, Long> {
}