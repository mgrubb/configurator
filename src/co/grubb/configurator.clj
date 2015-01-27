(ns co.grubb.configurator)

(defprotocol ConfigurationProvider
  "Operations for providing configuration parameters to applications"
  (init-store [store] "Initializes the configurations store")
  (save-store [store] "Causes the store to be persisted, if supported")
  (can-save? [store] "Determines if the store can save changes back to the persistent store."))

(defn load-config [uri &options])
