(ns get-started.lucious-lasangna)

(def expected-time 40)

(defn remain-time [actual-minutes]
  (- expected-time  actual-minutes))

(defn prep-time [time]
  (* time 2))

(println (prep-time 3)
         (flush))
