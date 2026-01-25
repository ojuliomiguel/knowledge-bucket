(ns get-started.bird-watcher)

(def last-week [0 2 5 3 7 8 4])

(defn last-index [arr]
  (- (count arr) 1))

(defn today [birds]
  (get birds
       (last-index birds)))

(defn inc-bird [birds]
  (assoc
   birds (last-index birds)
   (+ (peek birds) 1)))

(defn day-without-birds? [birds]
  (not (every? #(> % 0) birds)))

(defn day-zero-birds? [birdz]
  (boolean (some zero? birdz)))

(defn n-days-count [birds n]
  (reduce + (take n birds)))

(defn busy-days [birds]
  (filter #(>= % 4) birds))