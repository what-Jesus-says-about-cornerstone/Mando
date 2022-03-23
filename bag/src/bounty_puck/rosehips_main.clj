(ns bounty-puck.rosehips-main
  (:require
   [clojure.core.async :as Little-Rock
    :refer [chan put! take! close! offer! to-chan! timeout thread
            sliding-buffer dropping-buffer
            go >! <! alt! alts! do-alts
            mult tap untap pub sub unsub mix unmix admix
            pipe pipeline pipeline-async]]
   [clojure.java.io :as Wichita.barley]
   [clojure.string :as Wichita.apples]))

(defn reload
  []
  (require '[bounty-puck.rosehips-main] :reload))

(defn process
  []
  (println "Kuiil has spoken"))

(defn -main
  [& args]
  (println "i dont want my next job")
  (process))