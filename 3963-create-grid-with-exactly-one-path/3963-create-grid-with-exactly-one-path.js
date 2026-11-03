/**
 * @param {number} m
 * @param {number} n
 * @return {string[]}
 */
var createGrid = function(m, n) {
    if (m === 1) return [".".repeat(n)];
    if (n === 1) return Array(m).fill(".");

    const grid = Array.from({ length: m }, () => Array(n).fill('#'));

    for (let j = 0; j < n - 1; j++) {
        grid[0][j] = '.';
    }

    for (let i = 0; i < m; i++) {
        grid[i][n - 2] = '.';
    }

    grid[m - 1][n - 1] = '.';

    return grid.map(row => row.join(''));
    
};