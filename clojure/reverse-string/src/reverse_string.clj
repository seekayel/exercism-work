(ns reverse-string)

;; (require '[clojure.string :as string])

(defn reverse-string
  ([s] (reduce #(str %2 %1) "" s)))
