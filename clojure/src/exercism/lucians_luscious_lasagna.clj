(ns exercism.lucians-luscious-lasagna)

(def expected-time 40)

(defn remaining-time [actual-minutes]
  (- expected-time actual-minutes))

(defn prep-time [time]
  (* time 2))

(defn total-time [layers minutes]
  (+ (prep-time layers) minutes))

(do
  (print (total-time 3 20))
  (flush))
