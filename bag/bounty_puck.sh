#!/bin/bash

repl(){
  clj \
    -J-Dclojure.core.async.pool-size=1 \
    -X:repl Ripley.core/process \
    :main-ns bounty-puck.main
}


main(){
  clojure \
    -J-Dclojure.core.async.pool-size=1 \
    -M -m bounty-puck.main
}

jar(){

  rm -rf out/*.jar
  clojure \
    -X:uberjar Genie.core/process \
    :main-ns bounty-puck.main \
    :filename "\"out/bounty-puck-$(git rev-parse --short HEAD).jar\"" \
    :paths '["src"]'
}

release(){
  docker build -t $1/bouty-puck:$(git rev-parse --short HEAD) .
  docker build -t $1/bouty-puck:latest .
}

push(){
  docker push $1/bouty-puck:$(git rev-parse --short HEAD)
  docker push $1/bouty-puck:latest
}

ui-dev(){
  npm i --no-package-lock
  cp src/bounty_puck/index.html out/ui/index.html
  clj -A:ui -M -m shadow.cljs.devtools.cli watch ui
}

ui-release(){
  npm i --no-package-lock
  rm -rf out/ui
  mkdir -p out/ui
  cp src/bounty_puck/index.html out/ui/index.html
  clj -A:ui -M -m shadow.cljs.devtools.cli release ui
}

"$@"