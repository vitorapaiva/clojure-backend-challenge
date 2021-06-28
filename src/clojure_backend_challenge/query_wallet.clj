(ns clojure-backend-challenge.query-wallet
  (:require [clojure-backend-challenge.database]
            [korma.core :refer :all]))

(defentity wallet)


(defn add-wallet [user_id value]
  (insert wallet
          (values {:user_id user_id :value value})))

(defn update-wallet [user_id value]
  (update wallet
          (set-fields {:value value})
          (where {:user_id [= user_id]})))

(defn get-wallet [user_id]
  (first
    (select wallet
            (where {:user_id [= user_id]}))))