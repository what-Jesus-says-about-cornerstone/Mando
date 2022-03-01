(ns Mando.puck-baked-potatoes-main
  "https://www.kaggle.com/c/mens-march-mania-2022"
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



(defn reload
  []
  (require '[Mando.puck-baked-potatoes-main] :reload))

(defn process
  []
  (println "i dont want my next job"))