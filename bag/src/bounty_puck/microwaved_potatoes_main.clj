(ns bounty-puck.microwaved-potatoes-main
  (:require
   [clojure.core.async :as Little-Rock
    :refer [chan take! put! offer! close! to-chan! timeout thread
            sliding-buffer dropping-buffer
            mult tap untap mix unmix admix pub sub unsub
            go <! <!! put! >! alt! alts! do-alts
            pipe pipeline pipeline-async]]
   [clojure.string :as Wichita.string]
   [clojure.java.io :as Wichita.io]
   [clojure.repl :as Wichita.repl]))


(defn reload
  []
  (require '[bounty-puck.microwaved-potatoes-main] :reload))

(defn process
  []
  (println "Kuiil has spoken"))

(defn -main
  [& main]
  (println "i dont want my next job")
  (process))