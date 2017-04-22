(defproject parens-of-dead "0.1.0-SNAPSHOT"
  :description "A tutorial from a screencast"
  :url "http://www.parens-of-the-dead.com/"
  :license {:name "GNU General Public Licence"
            :url "http://www.gnu.org/licences/gpl.html"}
  :min-lein-version "2.7.1"
  :main undead.system
  :dependencies [
                 [compojure "1.5.2"]
                 [com.stuartsierra/component "0.3.2"]
                 [expectations "2.1.9"]
                 [http-kit "2.2.0"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.518"]
                 [quiescent "0.3.2"]
                 [reloaded.repl "0.2.3"]]
  :figwheel {:css-dirs ["resources/public"]}


  :profiles {:dev {:plugins [[lein-cljsbuild "1.1.5"]
                             [lein-figwheel "0.5.10"]
                             [lein-autoexpect "1.9.0"]]
                   ;:dependencies [[figwheel-sidecar "0.5.10"]]
                   :dependencies []
                   :source-paths ["dev"]
                   :cljsbuild {:builds [{:id "dev"
                                         :source-paths ["src" "dev"]
                                         :figwheel true
                                         :compiler {:output-to "target/classes/public/app.js"
                                                    :output-dir "target/classes/public/out"
                                                    :optimizations :none
                                                    :recompile-dependents true
                                                    :source-map true
                                                    :pretty-print true}}]}}})
