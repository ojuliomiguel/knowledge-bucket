(ns get-started.cars-assemble-optimized)

(def base-production-rate 221)

(def success-rates
  [{:max-speed 0 :rate 0.0}
   {:max-speed 4 :rate 1.0}
   {:max-speed 8 :rate 0.9}
   {:max-speed 9 :rate 0.8}
   {:max-speed 10 :rate 0.77}])

(defn success-rate [speed]
  (:rate 
   (first 
    (filter #(<= speed (:max-speed %)) 
            success-rates))))

;keyword as a function:

(:max-speed {:max-speed 8 :rate 0.9}) ;; => 8

(defn _success-rate [speed]
  (->> success-rates
       (filter #(<= speed (:max-speed %)))
       first
       :rate))

(defn production-rate [speed]
  (double (* speed base-production-rate (success-rate speed))))

(defn working-items [speed]
  (int (/ (production-rate speed) 60)))
