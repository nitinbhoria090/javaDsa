/**
 * @param {number[]} arr
 * @return {number[]}
 */
function mergesort(arr, st, end) {
    if (st >= end) return
    let mid = Math.floor(st + (end - st) / 2)
    mergesort(arr, st, mid)
    mergesort(arr, mid + 1, end)
    merge(arr, st, end, mid)
}
function merge(arr, st, end, mid) {
    let i = st
    let j = mid + 1
    let n = arr.length
    let nums = []
    while (i <= mid && j <= end) {
        if (arr[i] < arr[j]) {
            nums.push(arr[i])
            i++
        } else {
            nums.push(arr[j])
            j++
        }
    }
    while (i <= mid) {
        nums.push(arr[i])
        i++
    }
    while (j <= end) {
        nums.push(arr[j])
        j++
    }
    for (let i = 0; i < nums.length; i++) {
        arr[st + i] = nums[i]
    }

}
var sortArray = function (arr) {
    let st = 0
    let end = arr.length - 1
     mergesort(arr, st, end)
     return arr
};