(ns brave-clojure.add-100)

(defn add-100 
  [number]
  (let [one-hundred 100]
    (+ number one-hundred)))

(add-100 1)
