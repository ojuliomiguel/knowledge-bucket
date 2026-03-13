(ns brave-clojure.double-numbers)

; In Clojure we do not "iterate"; we transform data.

(def numbers [1 2 3 4 5 6 7 8 0])

(map #(* 2 %) numbers)
