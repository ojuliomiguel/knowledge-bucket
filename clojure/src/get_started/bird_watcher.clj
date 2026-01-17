(ns get-started.bird-watcher)

(def last-week [0 2 5 3 7 8 4])

(defn today [birds]
  (get birds
       (- (count birds) 1)))

(defn inc-bird [birds]
  (conj birds
        (+ (peek birds) 1)))


(println (today last-week))