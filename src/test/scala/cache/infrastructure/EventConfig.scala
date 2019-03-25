package cache.infrastructure

import com.amazonaws.regions.Regions

class EventConfig(val eventType : String) {
  var region = Regions.EU_CENTRAL_1
}
