(ns undead.game)

(def faces [:h1 :h1 :h2 :h2 :h3 :h3 :h4 :h4 :h5 :h5
            :fg :fg :zo :zo :zo :gy])

(defn ->tile [face]
  {:face face :revealed? false :matched? false})

(defn create-game []
  {:tiles (->> (map ->tile faces)
               shuffle)
   :sand (repeat 30 :remaining)})
