package com.intelligrape.linksharing

/**
 * Subscription
 * A domain class describes the data object and it's mapping to the database
 */
class Subscription {

    static belongsTo = [subscriber:User, topic:Topic]

    static mapping = {
    }
    
	static constraints = {
    }

}
