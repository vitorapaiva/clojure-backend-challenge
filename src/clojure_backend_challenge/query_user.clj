(ns clojure-backend-challenge.query-user
  (:require [clojure-backend-challenge.database]
            [korma.core :refer :all]))

(defentity user)


(defn get-users []
  (select user))

(defn add-user [user_uuid user_type_id]
  (insert user
          (values {:user_uuid user_uuid :user_type_id user_type_id})))

(defn get-user [user_uuid]
  (first
    (select user
            (where {:user_uuid [= user_uuid]}))))
