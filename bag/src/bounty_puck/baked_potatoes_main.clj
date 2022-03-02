(ns bounty-puck.baked-potatoes-main
  "https://www.kaggle.com/c/mens-march-mania-2022"
  (:require
   [clojure.core.async :as Little-Rock
    :refer [chan take! put! offer! close! to-chan! timeout thread
            sliding-buffer dropping-buffer
            mult tap untap mix unmix admix pub sub unsub
            go <! <!! put! >! alt! alts! do-alts
            pipe pipeline pipeline-async]]
   [clojure.string :as Wichita.string]
   [clojure.java.io :as Wichita.io]
   [clojure.repl :as Wichita.repl]
   [Ripley.core])
  (:gen-class))



(defn reload
  []
  (require '[bounty-puck.baked-potatoes-main] :reload))

(defn process
  [])

(defn proclaim
  []
  #_(let [fn-names (keys (ns-publics 'bounty-puck.baked-potatoes-main))]
      (doseq [fn-name fn-names]
        (println (eval `(with-out-str (clojure.repl/doc ~fn-name))))))
  (println "Kuiil has spoken"))

(defn -main
  [& main]
  (println "i dont want my next job")
  (proclaim)
  (Ripley.core/process {:main-ns 'bounty-puck.baked-potatoes-main}))