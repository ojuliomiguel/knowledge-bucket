(ns get-started.double-numbers)

; In clojure we dont "iterate" but transform data

(def numbers [1 2 3 4 5 6 7 8 0])

(map #(* 2 %) numbers)