(defproject program ""

  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/core.async "1.5.648"]

                 [com.formdev/flatlaf "2.1"]
                 [com.formdev/flatlaf-extras "2.1"]
                 [com.miglayout/miglayout-swing "5.3"]

                 [io.replikativ/datahike "0.5.1504"]]

  :source-paths ["src"]
  :target-path "out"
  :jvm-opts ["-Dclojure.compiler.direct-linking=true"
             "-Dclojure.core.async.pool-size=8"]

  :main Mando.main
  :profiles {:uberjar {:aot :all}}
  :repl-opts {:init-ns Mando.main}

  :uberjar-name ~(str "Mando-"
                      (->
                       (clojure.java.shell/sh "git" "rev-parse" "--short" "HEAD")
                       :out
                       (clojure.string/trim-newline))
                      ".jar"))