(ns clojure-backend-challenge.service.user
  (:require [clojure-backend-challenge.database]
            [clojure-backend-challenge.repository.user :as user-repo]
            [korma.core :refer :all]))

(defn get-users []
  (user-repo/get-users))

(defn add-user [user_uuid user_type_id]
  (user-repo/add-user user_uuid user_type_id))

(defn get-user [user_uuid]
  (user-repo/get-user user_uuid))
