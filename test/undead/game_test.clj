(ns undead.game-test
  (:require [expectations :refer :all]
            [undead.game :refer :all]))
; creation game
(expect
  {:h1 2 :h2 2 :h3 2 :h4 2 :h5 2 :fg 2 :zo 3 :gy 1}
  (->> (create-game)
       :tiles
       (map :face)
       frequencies))

(expect {:remaining 30}
  (->> (create-game)
       :sand
       frequencies))


(expect false
        (->> (repeatedly 10 create-game)
             (map :tiles)
             (apply =)))


(def k [{:tiles [{:face :h1} {:face :h2}]}
        {:tiles [{:face :h1} {:face :h2}]}])
        ;{:tiles [{:face :h2} {:face :h1}]}])
