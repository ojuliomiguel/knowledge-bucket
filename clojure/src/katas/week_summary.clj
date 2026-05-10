(ns katas.week-summary)

(def week
  {:days ["mon" "tue" "wed" "thu" "fri" "sat" "sun"]
   :birds [0 2 5 3 7 8 4]})

(defn week_summary
  [{:keys [days birds]}]
  (let [total (reduce + birds)
        busy (count (filter #(>= % 5) birds))
        zero (some zero? birds)
        best-day (first
                  (apply max-key second
                         (map vector days birds)))]
    {:total total
     :busy busy
     :day-with-zero zero
     :best-day best-day}))

(week_summary week)