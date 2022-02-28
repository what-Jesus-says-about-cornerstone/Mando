(ns Mando.puck-march-mania-2022_main
  (:require
   [clojure.core.async :as Little-Rock
    :refer [chan take! put! offer! close! to-chan! timeout thread
            sliding-buffer dropping-buffer
            mult tap untap mix unmix admix pub sub unsub
            go <! put! >! alt! alts! do-alts
            pipe pipeline pipeline-async]]
   [clojure.string :as Wichita.apples]
   [clojure.java.io :as Wichita.barley])
  (:gen-class))

(defn -main
  [& args]
  (println "i dont want my next job"))