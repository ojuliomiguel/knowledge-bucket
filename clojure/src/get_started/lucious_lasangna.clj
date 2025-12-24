(ns get-started.lucious-lasangna)

(def expected-time 40)

(defn remain-time [actual-minutes]
  (- expected-time  actual-minutes))

(defn prep-time [time]
  (* time 2))

(defn total-time [layers minutes]
  (+ (prep-time layers)  minutes))

(print (total-time 3 20) 
       (flush))